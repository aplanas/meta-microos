SUMMARY = "aptitude compatibility with zypper"
DESCRIPTION = "provides compatibility to Debian's aptitude command using zypper \
 \
Authors: \
-------- \
    Bernhard M. Wiedemann <bernhard+aptitude4zypp lsmod de>"
LICENSE = "GPL-2.0+"

PV = "1.14.60"

RPM_NAME = "zypper-aptitude-1.14.60-1.1.noarch.rpm"
RPM_HASH = "06e57615d55bbec1e95d2a7cae1d46075d7950397f5ffdf2e2a9c7af3b21aa851c349330fa7f0ef952a909173ec810e680f43969d86e8d3694e10201937ea13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(zypper-aptitude) \
zypper-aptitude"
RDEPENDS:${PN} += "/usr/bin/perl \
perl \
zypper"

inherit rpm
