SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-uri-template-1.2.0-2.1.noarch.rpm"
RPM_HASH = "214ba6866583e4d0c065ca345ebb8794fc19366085051442bc7bb99acfef442d68f8d1cd4bcfaa8e115b019f2f02985523183ee5e7502cffa91fdce17b2a9b48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uri-template) python311-uri-template python311-uri_template python3dist(uri-template)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
