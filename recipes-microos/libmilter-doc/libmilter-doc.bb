SUMMARY = "BSD Sendmail Content Management API (milter)"
DESCRIPTION = "Sendmail's Content Management API (milter) provides third-party programs to \
access mail messages as they are being processed by the Mail Transfer Agent \
(MTA), allowing them to examine and modify message content and \
meta-information. Filtering policies implemented by Milter-conformant filters \
may then be centrally configured and composed in an end-user's MTA \
configuration file. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "libmilter-doc-8.17.1-8.3.noarch.rpm"
RPM_HASH = "c8d983d77092ab34c178c47f8e38615d92038af94c0e4246d79ae8baedc1e94d8f6c7e1547dee8630384cc37d5f273d0888746831183c0f73b95ed64f40532a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmilter-doc"
RDEPENDS:${PN} += "libmilter1_0"

inherit rpm
