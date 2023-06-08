SUMMARY = "Glob module recursive wildcards support"
DESCRIPTION = "This module provides an extended version of Python's builtin glob \
module with the following additions: \
 \
- The ability to capture the text matched by glob patterns, and \
  return those matches alongside the filenames. \
- A recursive '**' globbing syntax, akin for example to the globstar \
  option of the bash shell. \
- The ability to replace the filesystem functions used, in order to \
  glob on virtual filesystems."
LICENSE = "BSD-2-Clause"

PV = "0.7"

RPM_NAME = "python39-glob2-0.7-2.13.noarch.rpm"
RPM_HASH = "b5f36dbf2304062a8daf35c4173d110865cb7f2b6da32c186e00385c6ced0fbc01b2bffa3c9636a166d6cc993c040d4cff9580dc3d1756b534850e29bdba3df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(glob2) python39-glob2 python3dist(glob2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
