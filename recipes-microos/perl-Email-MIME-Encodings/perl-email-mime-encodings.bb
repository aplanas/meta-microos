SUMMARY = "Unified interface to MIME encoding and decoding"
DESCRIPTION = "This module simply wraps 'MIME::Base64' and 'MIME::QuotedPrint' so that you \
can throw the contents of a 'Content-Transfer-Encoding' header at some text \
and have the right thing happen. \
 \
'MIME::Base64', 'MIME::QuotedPrint', 'Email::MIME'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.317"

RPM_NAME = "perl-Email-MIME-Encodings-1.317-1.2.noarch.rpm"
RPM_HASH = "de1761ad2da277f1209f4389fd653c9232c48ab5ea9dd5672b10d69ff95dbe8272da368fb9f3b81f2d7b5c50d7f73b1cf3d4c7f31691972815d04f9973b81bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Email::MIME::Encodings) perl-Email-MIME-Encodings"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
