SUMMARY = "Interactive data selection cursors for Matplotlib"
DESCRIPTION = "mplcursors provides interactive data selection cursors for Matplotlib."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python311-mplcursors-0.5.2-1.3.noarch.rpm"
RPM_HASH = "0e2e5e1e1ec2f26e1219aef6d5057b6afaac6e7aa2f97f5a67b18097ecf2fd5e52a252e435d0da270457d85b1dff554abd70177be5fe6734ab81e0112795efc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mplcursors) python311-mplcursors python3dist(mplcursors)"
RDEPENDS:${PN} += "python(abi) python311-matplotlib"

inherit rpm
