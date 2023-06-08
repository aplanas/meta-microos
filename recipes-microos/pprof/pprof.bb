SUMMARY = "CLI tool for visualization and analysis of profiling data"
DESCRIPTION = "pprof reads a collection of profiling samples in profile.proto format and generates reports to visualize and help analyze the data. \
It can generate both text and graphical reports (through the use of the dot visualization package)."
LICENSE = "Apache-2.0"

PV = "0.0.0+git20220520.d04f242"

RPM_NAME = "pprof-0.0.0+git20220520.d04f242-1.5.aarch64.rpm"
RPM_HASH = "9d07068a609418c726fe71250bac3d6ef982eea51f933db03bac1849170c87dcc1d8adf954c46ce2d79ab734dc575d87c73b2ecfa9fefb698097a1471d40fddb"

RPROVIDES:${PN} += "pprof pprof(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
