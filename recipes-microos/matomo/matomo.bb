SUMMARY = "Web analytics platform"
DESCRIPTION = "Matomo, formerly Piwik, is a web analytics platform that gives \
insights into a website's visitors and marketing campaigns, so the \
strategy and online experience of visitors may be optimized."
LICENSE = "GPL-3.0-or-later"

PV = "4.14.2"

RPM_NAME = "matomo-4.14.2-1.1.noarch.rpm"
RPM_HASH = "2717e78fab932d3ecb8dbd8f06796836e45e2c16da958503927b3b9804ab6c60049ec8fe0c2bfafa70282856700ef4e9d91532202f332f48ca53bdb668ab8454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(matomo) matomo"
RDEPENDS:${PN} += "/bin/sh /usr/bin/php /usr/bin/python3 group(www) logrotate nodejs php php-ctype php-curl php-dom php-gd php-iconv php-json php-mbstring php-mysql php-pdo php-tokenizer php-xmlreader php-xmlwriter php-zlib python3 systemd user(wwwrun)"

inherit rpm
