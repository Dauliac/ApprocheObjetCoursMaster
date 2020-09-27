

// Value Objects
public class Reference {

    // Alphanumeric: base36 with exact size of 20 digits
    // https://regex101.com/r/JphbQo/2
    public final String regexConstraint = "^[a-zA-Z0-9]{20}$";
    public final int baseEncoding = 36;
    // TODO: Ask if I can use Long that are arythmetic and usable without
    // convertion
    // In my opinion String36 is only usefull for display/url/views
    public final String id;

    public Reference(String id) {
        Pattern pattern = Pattern.compile(this.regexConstraint);
        Matcher matcher = pattern.matcher(id);
        if(matcher.matches()) {
            this.id = id;
        } else {
            // There is no id, error;
            throw new ArgumentNullException("id");
        }
    }

    public static Bool equal(Ref reference) {
        return ( this.id == reference.id
            && this.baseEncoding == reference.baseEncoding
        ) ? true : false;
    }

    // There is a problem here: Long type is smaller than 36^20
    // TODO verify by calcul/unit test ?
    public static String getNextRef() {
        final Long idLong = Long.parseLong(this.id, this.baseEncoding);
        return new Reference(Long.toString(idLong + 1, this.baseEncoding));
    }
}