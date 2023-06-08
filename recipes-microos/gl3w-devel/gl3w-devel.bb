SUMMARY = "Header files for gl3w"
DESCRIPTION = "gl3w is a way to get at functionality offered by the \
OpenGL core profile specification. \
 \
This package contains header files for gl3w."
LICENSE = "Unlicense"

PV = "2022.03.24"

RPM_NAME = "gl3w-devel-2022.03.24-2.2.aarch64.rpm"
RPM_HASH = "0486ecee3c9534cf192dcbc89f85aa8bee466070f9d318b017039fa2fc6c29e766aef577439776644106ec64dfe992536bc6724230aa2b13d6427d98ef00453c"

RPROVIDES:${PN} += "gl3w-devel gl3w-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
