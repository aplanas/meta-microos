SUMMARY = "The Python Gateway Script: news2mail mail2news gateway"
DESCRIPTION = "Python Gateway Script from news to mail and vice versa. \
 \
It is intended to be a full SMTP/NNTP rfc compliant gateway \
with whitelist manager. \
 \
You will probably have to install a mail-transport-agent and/or \
news-transport-system package to manage SMTP/NNTP traffic. \
 \
MTA is needed for mail2news service, since mail have to be \
processed on a box where pyg is installed. You can use a remote \
smtpserver for news2mail. \
 \
News system is useful but not needed, since you can send articles to a \
remote SMTP server (ie: moderated NG) where is installed pyg, otherwise you \
will need it. \
 \
It refers to rfc 822 (mail) and 850 (news)."
LICENSE = "GPL-3.0-only"

PV = "0.10.2"

RPM_NAME = "python39-pygn-0.10.2-2.4.noarch.rpm"
RPM_HASH = "4faa8115ea79843f718511c25f313a905337934a58ffae97418847726816dda1e573e6961536eebc6353e3c4315bbe86a0b9df828da6ca5620819642ae323f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pygn) python39-pygn python3dist(pygn)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
