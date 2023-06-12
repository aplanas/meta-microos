SUMMARY = "Package to return structured data from the output of network devices"
DESCRIPTION = "TextFSM is a project built by Google that takes CLI string output and passes each line through a series of regular expressions until it finds a match. The regular expressions use named capture groups to build a text table out of the significant text. The names of the capture groups are used as column headers, and the captured values are stored as rows in the table."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python311-ntc-templates-3.1.0-1.3.noarch.rpm"
RPM_HASH = "88aaed0fb5853d9a897d5b44246ba3fb925fff67db44e4525d6680eed3c9484de0016c47d5c8ba54f8266e4dbae1bd979f62ec0879e2ec6d7940113ec123e9dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ntc-templates) \
python311-ntc-templates \
python3dist(ntc-templates)"
RDEPENDS:${PN} += "python(abi) \
python311-textfsm"

inherit rpm
