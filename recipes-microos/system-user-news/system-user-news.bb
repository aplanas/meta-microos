SUMMARY = "System user and group 'news'"
DESCRIPTION = "This package provides the system account and group 'news' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-news-20170617-24.14.noarch.rpm"
RPM_HASH = "de9a818a7879b2887e10a1a8af5edf27e8019150c00cd51caaa21de9478b7bbf6d0e6544c1dfdb03620df65be4ad54ebea9e09facb613b301a48fea911208257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(news) \
system-user-news \
user(news)"
RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
