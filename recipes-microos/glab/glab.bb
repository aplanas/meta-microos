SUMMARY = "A GitLab command line tool"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "glab-1.30.0-1.1.aarch64.rpm"
RPM_HASH = "661e5080dd4b868175fe5caa6ed552cd88eec94a1bbed6fdbeebabe323eb72bdb751c3441b0d943e3819842547aeb1e7c455e5cd5de8547cbae2bdcc345029e0"

RPROVIDES:${PN} += "glab glab(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
