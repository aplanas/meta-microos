SUMMARY = "Development files for the LAME MP3 encoder"
DESCRIPTION = "Contains the header files for use with LAME's encoding library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "libmp3lame-devel-3.100-5.3.aarch64.rpm"
RPM_HASH = "0f8e898d9230885b875c5977d0de2a84a1cdfd825acbbac139a189bd58c0131a39e07612eaa5973efca412104379fd9d7f6c32a7a7da0f91eaecc97c5ebb62d2"

RPROVIDES:${PN} += "libmp3lame-devel libmp3lame-devel(aarch-64) pkgconfig(lame) pkgconfig(libmp3lame)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmp3lame0"

inherit rpm
