SUMMARY = "Query SUSE Public Cloud Info Service"
DESCRIPTION = "Query the SUSE Public Cloud Information Service REST API"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "python3-susepubliccloudinfo-1.4.0-1.5.noarch.rpm"
RPM_HASH = "2e3f5774ca00db75d6b11b7eaa326a99a89d7d35b2a3602e33509caa869872a308f7cd7358c6701e76163a5dbd4e4a17955d2602c61d4c42154c8f7c5701b989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-susepubliccloudinfo python3-susepubliccloudinfo python3.10dist(susepubliccloudinfo) python3dist(susepubliccloudinfo)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3 python3-docopt python3-lxml python3-requests"

inherit rpm
