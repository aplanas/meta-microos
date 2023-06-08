SUMMARY = "Emit fedmsg messages from mailman3"
DESCRIPTION = "Emit fedmsg messages from mailman3."
LICENSE = "LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "python310-mailman3-fedmsg-plugin-0.5-1.13.noarch.rpm"
RPM_HASH = "d5ecdb1a263de670954b36cee08dd387c7207185d9d218e068a59cc1d1d15ad65224ae5684bf420a5c325ecd1d9072e59636728c927e6a976ea3ec7c2437c973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mailman3-fedmsg-plugin python3.10dist(mailman3-fedmsg-plugin) python310-mailman3-fedmsg-plugin python3dist(mailman3-fedmsg-plugin)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
