SUMMARY = "Receive RSS feeds by email"
DESCRIPTION = "Lets users receive news from RSS feeds in email. Intended to be run from \
a crontab, watches RSS feeds and sends formatted email messages for new \
items."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.14"

RPM_NAME = "python39-rss2email-3.14-1.5.noarch.rpm"
RPM_HASH = "9f62df20682ca49a09aab9cd565a663a9ce42aedc2a07896ee8af3d16207f3e41dc7c8de5a835e0254b86aefe901f8f6288336c27f13f1caf2cae747ba841a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rss2email) python39-rss2email python3dist(rss2email)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python3.9dist(feedparser) python3.9dist(html2text) python39-feedparser python39-html2text python39-setuptools update-alternatives"

inherit rpm
