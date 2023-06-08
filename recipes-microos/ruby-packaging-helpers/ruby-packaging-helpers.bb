SUMMARY = "Ruby packaging helpers"
DESCRIPTION = "This package is needed for (generated) ruby gems. It provides hooks for \
automatic rpm provides and requires and macros that gem2rpm uses. \
 \
Some helper tools for packaging rubygems and rails apps."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "ruby-packaging-helpers-3.2-3.1.noarch.rpm"
RPM_HASH = "7dc4fe6bd21508c7434c9ce3e9d75a90d55585ad14ecdfc50fd7aeb4f35db3142e5de86965ae81e69463166bc4fe556b522a9b87b12b531c38266929b7718c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-packaging-helpers"
RDEPENDS:${PN} += "/usr/bin/ruby ruby-common"

inherit rpm
