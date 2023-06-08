SUMMARY = "Interactive visualization in Python"
DESCRIPTION = "Vispy is an interactive 2D/3D data visualization library. It leverages Graphics \
Processing Units through the OpenGL library to display large datasets."
LICENSE = "BSD-3-Clause"

PV = "0.12.2"

RPM_NAME = "python311-vispy-0.12.2-1.2.aarch64.rpm"
RPM_HASH = "986715d5bcd58e0d8e9256069da35e7df2739274270ec548ddddc53d2bf62868f094fc5461caca9e8f9e3e94f0f9e345b1089f4824018d696d7ad1209178ff6b"

RPROVIDES:${PN} += "python3.11dist(vispy) python311-vispy python311-vispy(aarch-64) python3dist(vispy)"
RDEPENDS:${PN} += "fontconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-cassowary python311-decorator python311-freetype-py python311-husl python311-numpy python311-pypng python311-qt5"

inherit rpm
