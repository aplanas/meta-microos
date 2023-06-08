SUMMARY = "Large graph viewer"
DESCRIPTION = "Experimental large graph viewer using graphviz"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-smyrna-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "41f03ad48ff1947a1900aca6c35bc2f532455b91cf93838f497fa5df3674587aa973dd0aeb139da60e6e3d60ef4b6ea36db10b1d3303731759bd048cfbfa4052"

RPROVIDES:${PN} += "graphviz-smyrna graphviz-smyrna(aarch-64)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcdt.so.5()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdkglext-x11-1.0.so.0()(64bit) libglade-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libglut.so.3()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libgtkglext-x11-1.0.so.0()(64bit) libgts-0.7.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
