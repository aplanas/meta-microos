SUMMARY = "A terminal descriptions database for screen"
DESCRIPTION = "This package includes some useful entries for the screen utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "terminfo-screen-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "f87b4b1fdf6a1cc63c30796ba0454bcc8646f6c626d49019cd010cdd248566c4e4ccdffdbd7f4b714cf5cd30ee32cb1474ed23c7cd9bdfca0985b9a73ac3e2f3"

RPROVIDES:${PN} += "terminfo-screen terminfo-screen(aarch-64) terminfo:/usr/share/terminfo/s/screen.konsole"
RDEPENDS:${PN} += "terminfo-base"

inherit rpm
