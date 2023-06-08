SUMMARY = "Tool to convert json to yaml"
DESCRIPTION = "This is a small tool to convert json to yaml reading from STDIN and writing to STDOUT."
LICENSE = "MIT"

PV = "0.0+git20191212.bf2969b"

RPM_NAME = "gojsontoyaml-0.0+git20191212.bf2969b-1.16.aarch64.rpm"
RPM_HASH = "a4b489ec2c9f5db463986feedbe2e3856d93b7275bc3c465c95732e54f747ac68e02691bbb9e67f3afc748f3561f6169e9bcaf7aaf1c015e7c00054aab3e1dc8"

RPROVIDES:${PN} += "gojsontoyaml gojsontoyaml(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
