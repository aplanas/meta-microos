SUMMARY = "Pythonic IMAP client library"
DESCRIPTION = "IMAPClient is a Pythonic IMAP client library. \
 \
Features: \
    * Arguments and return values are natural Python types. \
    * IMAP server responses are parsed and readily usable. \
    * IMAP unique message IDs (UIDs) and internationalised \
      mailbox names are handled transparently. \
    * Time zones are handled. \
    * Convenience methods are provided for commonly used functionality. \
    * Exceptions are raised when errors occur. \
 \
IMAPClient includes comprehensive units tests and automated \
functional tests that can be run against a live IMAP server."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python311-IMAPClient-2.3.1-2.3.noarch.rpm"
RPM_HASH = "9840ba42677f642878a63cfe3e82f267cdf6bae39349a52fc4fedb772f311aa4d933eb7d3ca1bee1be5290312803998ce684cce3bc20dbd805f1924bb58cdf53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(imapclient) python311-IMAPClient python3dist(imapclient)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
