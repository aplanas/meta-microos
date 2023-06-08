SUMMARY = "NS1 Authenticator plugin for Certbot"
DESCRIPTION = "Nsone DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-nsone-1.31.0-1.4.noarch.rpm"
RPM_HASH = "e0d3dee08ae8a946c8b3ed2ac1376be39719dba4210449c09036073a42877de2c21b3d442558edc8fad2dee4035cd39e64e381b161803f8776700b288fc1c79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-nsone python3.10dist(certbot-dns-nsone) python310-certbot-dns-nsone python3dist(certbot-dns-nsone)"
RDEPENDS:${PN} += "python(abi) python310-acme python310-certbot python310-dns-lexicon"

inherit rpm
