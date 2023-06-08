SUMMARY = "Web application framework for the impatient"
DESCRIPTION = "Bobo is a framework for creating WSGI web applications. \
It addresses two problems: mapping URLs to objects, \
and calling objects to generate HTTP responses. \
 \
Bobo doesn't have a templating language, a database integration layer, \
nor a number of other features that are better provided by WSGI \
middle-ware or application-specific libraries. \
 \
Bobo builds on other frameworks, most notably WSGI and WebOb."
LICENSE = "ZPL-2.1"

PV = "2.4.0"

RPM_NAME = "python310-bobo-2.4.0-5.9.noarch.rpm"
RPM_HASH = "1fa66742627db389cdb5279015d2b47307f2cde7283a41cb19a33181d9123424bab726ae86ce8ece3b84103cd05e750538f1fc3ad16c39b1f03f52e797f6144a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bobo python3.10dist(bobo) python310-bobo python3dist(bobo)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-WebOb python310-six update-alternatives"

inherit rpm
