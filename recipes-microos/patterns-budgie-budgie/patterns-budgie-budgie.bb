SUMMARY = "Budgie Desktop Environment"
DESCRIPTION = "The Budgie Desktop is a feature-rich, modern desktop designed to keep out the way of the user."
LICENSE = "MIT"

PV = "20220527"

RPM_NAME = "patterns-budgie-budgie-20220527-2.2.aarch64.rpm"
RPM_HASH = "19540f2de1cf1630f1b86e930afded96647922f00af6bfacedbea395b9078c18a2ef92e45bcbe44c03ab7ffe30fa96398a771f1a39b27c38f182fc53f27b1ff1"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-budgie-budgie \
patterns-budgie-budgie(aarch-64)"
RDEPENDS:${PN} += "budgie-desktop \
lightdm \
pattern()"

inherit rpm
