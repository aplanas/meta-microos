SUMMARY = "Tool to check websites and HTML documents for broken links"
DESCRIPTION = "LinkChecker checks websites and HTML documents for broken links. \
 \
Features are: \
* recursive checking \
* multithreaded \
* output in colored or normal text, HTML, SQL, CSV, XML or a sitemap graph in different formats \
* HTTP/1.1, HTTPS, FTP, mailto:, news:, nntp:, Gopher, Telnet and local file links support \
* restriction of link checking with regular expression filters for URLs \
* proxy support \
* username/password authorization for HTTP and FTP \
* robots.txt exclusion protocol support \
* i18n support \
* a command line interface \
* a (Fast)CGI web interface (requires HTTP server)"
LICENSE = "GPL-2.0-or-later"

PV = "10.1.0"

RPM_NAME = "python3-linkchecker-10.1.0-1.1.noarch.rpm"
RPM_HASH = "0873414248fc8b0d006441597929fb576a29f295badc9e15f7b2b91daccf580ebc3bbca153cb9bd90670d5ec55de653b0d6a512887a490f090b83bbf9ad14862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkchecker \
python3-linkchecker \
python3.10dist(linkchecker) \
python3dist(linkchecker)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-beautifulsoup4 \
python3-dnspython \
python3-pyxdg \
python3-requests \
update-alternatives"

inherit rpm
