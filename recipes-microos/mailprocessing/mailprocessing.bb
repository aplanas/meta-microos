SUMMARY = "Maildir and IMAP processor/filter using Python 3x as its configuration language"
DESCRIPTION = "The maildirproc and imapproc utilities provided by this package filter emails \
in maildirs and IMAP folders with a user provided filter script written in \
Python."
LICENSE = "GPL-2.0-only"

PV = "1.2.7"

RPM_NAME = "mailprocessing-1.2.7-1.10.noarch.rpm"
RPM_HASH = "538e1972c55857cf356b5151e608e40962fc0bbb747333c293638b31b3a1d924dce4c9028a3250ff9c9a3a6c1a14e28c7ecf1128f35d84d1748105a138183d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maildirproc \
mailprocessing \
python3.10dist(mailprocessing) \
python3dist(mailprocessing)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3"

inherit rpm
