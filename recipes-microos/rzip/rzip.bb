SUMMARY = "A large-file compression program"
DESCRIPTION = "rzip is a compression program, similar in functionality to gzip or \
bzip2, but able to take advantage long distance redundencies in files, \
which can sometimes allow rzip to produce much better compression \
ratios than other programs."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "rzip-2.1-149.16.aarch64.rpm"
RPM_HASH = "d5c706f2429f34e73491de9644315e8a896de5b19a43e4182155f32fd9086e95d07698d1b70268071fb49e8e3d5ea92b26c0fa2a51884744c66d619819dd078d"

RPROVIDES:${PN} += "rzip \
rzip(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
