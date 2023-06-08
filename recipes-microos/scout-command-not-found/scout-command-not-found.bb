SUMMARY = "Command Not Found extension for shell"
DESCRIPTION = "The 'command not found' message is not very helpful. If e.g. the unzip \
command is not found but it's available in a package, it would be very \
interesting if the system could tell that the command is currently not \
available, but installing a package would provide it."
LICENSE = "MIT"

PV = "0.2.7+20230124.b4e3468"

RPM_NAME = "scout-command-not-found-0.2.7+20230124.b4e3468-1.1.noarch.rpm"
RPM_HASH = "01ba8add4fb205e94be8be15547f6a6015b58699e4bd53697f48542c81cea625320756f122767a2a2a9e6273318de982738bc48dbff56cecf9a798f327d7373a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "command-not-found config(scout-command-not-found) scout-command-not-found"
RDEPENDS:${PN} += "/usr/bin/python3 python3 python3-rpm scout"

inherit rpm
