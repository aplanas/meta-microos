SUMMARY = "Low-calorie MIME generator"
DESCRIPTION = "In the never-ending quest for great taste with fewer calories, we proudly \
present: _MIME::Lite_. \
 \
MIME::Lite is intended as a simple, standalone module for generating (not \
parsing!) MIME messages... specifically, it allows you to output a simple, \
decent single- or multi-part message with text or binary attachments. It \
does not require that you have the Mail:: or MIME:: modules installed, but \
will work with them if they are. \
 \
You can specify each message part as either the literal data itself (in a \
scalar or array), or as a string which can be given to open() to get a \
readable filehandle (e.g., '<filename' or 'somecommand|'). \
 \
You don't need to worry about encoding your message data: this module will \
do that for you. It handles the 5 standard MIME encodings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.033"

RPM_NAME = "perl-MIME-Lite-3.033-1.9.noarch.rpm"
RPM_HASH = "a0682585d71a0176f2340f0173c505c84e825b135866d4f983522b59246e25522aff25b6419ae4dc61dc2e3ffe027e9f5b613cd1af8aa38aa1ac6abc00f05135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MIME::Lite) perl(MIME::Lite::IO_Handle) perl(MIME::Lite::IO_Scalar) perl(MIME::Lite::IO_ScalarArray) perl(MIME::Lite::SMTP) perl-MIME-Lite"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Email::Date::Format) perl(MIME::Types) perl(Mail::Address)"

inherit rpm
