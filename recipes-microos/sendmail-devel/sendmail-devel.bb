SUMMARY = "BSD Sendmail Development Kit"
DESCRIPTION = "This package includes libraries and header files for building tools to \
access sendmail features. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "sendmail-devel-8.17.1-8.3.aarch64.rpm"
RPM_HASH = "b209af661111048cf283260950e9093cd9e28327f27c248278905d0a152eb356d45652e1f9e9d40d5af607dcc5eafd1d2c23e8634ce95e926a6e01c624682c75"

RPROVIDES:${PN} += "sendmail-devel sendmail-devel(aarch-64)"
RDEPENDS:${PN} += "libmilter1_0"

inherit rpm
