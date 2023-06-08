SUMMARY = "A GitLab command line tool"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.29.1"

RPM_NAME = "glab-1.29.1-1.1.aarch64.rpm"
RPM_HASH = "ff1a94a4ff1d19ef1bb02145e8f40b8ac5668613c8da60f2903071f7d451f98f44633dd76a16c88cdc777b028dd98f88e82c7b211eaaccd629c010f1d2cb5abe"

RPROVIDES:${PN} += "glab glab(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
