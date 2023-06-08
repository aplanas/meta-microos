SUMMARY = "SBLIM CMPI Provider Development Support"
DESCRIPTION = "This packages provides the C and C++ CMPI header files needed by \
provider developers and can be used standalone. If used for C++ \
provider development it is also necessary to have tog-pegasus-devel \
installed."
LICENSE = "EPL-1.0"

PV = "2.0.3"

RPM_NAME = "sblim-cmpi-devel-2.0.3-8.26.aarch64.rpm"
RPM_HASH = "6236dff43053e8a2d462f774995f9397d1df5cdb3f0e3e39511e5648364e7da353bb77c0a6b789850099888872dc2d55fd04fecaabf12b2466b0da01b3a305b1"

RPROVIDES:${PN} += "cmpi-devel sblim-cmpi-devel sblim-cmpi-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
