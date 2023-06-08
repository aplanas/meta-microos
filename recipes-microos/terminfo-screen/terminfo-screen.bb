SUMMARY = "A terminal descriptions database for screen"
DESCRIPTION = "This package includes some useful entries for the screen utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "terminfo-screen-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "074a148fefff89d1230a235049ecabe7793981231688a898a0f4f43de26a73cea58e515e5d75cd52aa609a517921c2fccbb74e7c01ecb2d6b11f69959dc384ac"

RPROVIDES:${PN} += "terminfo-screen terminfo-screen(aarch-64) terminfo:/usr/share/terminfo/s/screen.konsole"
RDEPENDS:${PN} += "terminfo-base"

inherit rpm
