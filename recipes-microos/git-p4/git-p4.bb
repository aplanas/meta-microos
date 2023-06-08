SUMMARY = "Git tools for importing Perforce repositories"
DESCRIPTION = "Tools for importing Perforce repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-p4-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "8df40dbf343975d34911830d45f4d379ab87c609298ce31c788fee1bd9104063ca04252f4d8a12704d27777d785d50ca539a253c854b2b438a35b991fba6e421"

RPROVIDES:${PN} += "git-p4 git-p4(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 git-core"

inherit rpm
