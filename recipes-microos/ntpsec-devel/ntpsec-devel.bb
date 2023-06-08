SUMMARY = "Development files for ntpsec"
DESCRIPTION = "This package contains libraries needed to develop application \
that use ntpsec."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-devel-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "513c5cba5c0ba1fa413cab9799769bb782e097b2034d920153563a7e04e07a47836691d9bd5de53da9903875a38191abfe2beb0ce692c09825731752d16148b8"

RPROVIDES:${PN} += "ntpsec-devel ntpsec-devel(aarch-64)"
RDEPENDS:${PN} += "libntpc1"

inherit rpm
