SUMMARY = "CLI tool for visualization and analysis of profiling data"
DESCRIPTION = "pprof reads a collection of profiling samples in profile.proto format and generates reports to visualize and help analyze the data. \
It can generate both text and graphical reports (through the use of the dot visualization package)."
LICENSE = "Apache-2.0"

PV = "0.0.0+git20220520.d04f242"

RPM_NAME = "pprof-0.0.0+git20220520.d04f242-1.6.aarch64.rpm"
RPM_HASH = "1450dc82ec27c59b8ef3bfda2ac860dd0d175c6a231f2813fcd321c4b671b4763a93343b05ed623729389147db4766f5d5ceb468a29852e79bd0e317ee6e226e"

RPROVIDES:${PN} += "pprof pprof(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
