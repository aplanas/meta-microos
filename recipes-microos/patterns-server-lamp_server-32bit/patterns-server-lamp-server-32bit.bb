SUMMARY = "Web and LAMP Server"
DESCRIPTION = "The 32bit pattern complementing lamp_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-lamp_server-32bit-20210330-4.1.aarch64.rpm"
RPM_HASH = "68855133db6d217c3f97da7cd80b570a65ebbfa7fa18a671ca36a73d12e18e4bb4d40b583d05d602a60da9400acbae50c9b59c88556b646fdd3ecab964efcf50"

RPROVIDES:${PN} += "pattern() patterns-server-lamp_server-32bit patterns-server-lamp_server-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
