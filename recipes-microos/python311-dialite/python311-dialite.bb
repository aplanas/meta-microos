SUMMARY = "Python library to show simple dialogs"
DESCRIPTION = "Dialite is a pure Python package to show dialogs. It provides a \
handful of functions, each a verb, that can be used to inform(), \
warn() or fail() the user, or to ask_ok(), ask_retry() or \
ask_yesno(). \
 \
Dialite can show graphical dialogs, and falls back to a terminal \
interface if dialogs are unavailable (e.g. if not supported by the \
platform, or for SSH connections)."
LICENSE = "BSD-2-Clause"

PV = "0.5.3"

RPM_NAME = "python311-dialite-0.5.3-1.11.noarch.rpm"
RPM_HASH = "bc4fa6714662345b634132e69fe9fc08f1b5af0e7706a2b4a30e64ff90ec9bef7b4e3db524713db1edd9192df4a26f3f00fdee54845d7ac75c59443dff4d0811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dialite) python311-dialite python3dist(dialite)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
