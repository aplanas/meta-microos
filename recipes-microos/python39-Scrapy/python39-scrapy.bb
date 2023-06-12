SUMMARY = "A high-level Python Screen Scraping framework"
DESCRIPTION = "Scrapy is a high level scraping and web crawling framework for writing spiders \
to crawl and parse web pages for all kinds of purposes, from information \
retrieval to monitoring or testing web sites."
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python39-Scrapy-2.7.1-1.5.noarch.rpm"
RPM_HASH = "06886a2a56bcc69a8be3c3c02b2357f08ecb60a40552b63c12021d3c669e532e439c0d1fdcb498e396a3a78c7995c3746ea5ea1207f34d06dbba2186dcaff4f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scrapy) \
python39-Scrapy \
python3dist(scrapy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Protego \
python39-PyDispatcher \
python39-Twisted \
python39-cryptography \
python39-cssselect \
python39-itemadapter \
python39-itemloaders \
python39-lxml \
python39-parsel \
python39-pyOpenSSL \
python39-queuelib \
python39-service_identity \
python39-setuptools \
python39-tldextract \
python39-w3lib \
python39-zope.interface \
update-alternatives"

inherit rpm
