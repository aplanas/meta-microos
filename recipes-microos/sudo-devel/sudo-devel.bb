SUMMARY = "Header files needed for sudo plugin development"
DESCRIPTION = "These header files are needed for building of sudo plugins."
LICENSE = "ISC"

PV = "1.9.13p3"

RPM_NAME = "sudo-devel-1.9.13p3-3.1.aarch64.rpm"
RPM_HASH = "a83a8ba86c4533e4cfa60d43dcf64f9ddace3cc9cb9135927971661da3af94bfb47c9531298b1987abe5a49657a0c02bc2eaff34b2f353596783acc6434082eb"

RPROVIDES:${PN} += "sudo-devel \
sudo-devel(aarch-64)"
RDEPENDS:${PN} += "sudo"

inherit rpm
