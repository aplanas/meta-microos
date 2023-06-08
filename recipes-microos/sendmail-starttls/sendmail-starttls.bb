SUMMARY = "BSD Sendmail Starttls helper scripts"
DESCRIPTION = "This package includes the directory layout as well as some useful \
helper scripts for better SSL/TLS support. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "sendmail-starttls-8.17.1-8.3.noarch.rpm"
RPM_HASH = "0ef6c648d829a9c7bdc773546fef69f05219bf0a29c7875876e6cbd0519262d936a77878f506e1ccf40bf4024fe80cefd382813d2df398d3708d83b0df93e2a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sendmail-starttls"
RDEPENDS:${PN} += "cyrus-sasl-saslauthd openssl"

inherit rpm
