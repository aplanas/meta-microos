SUMMARY = "PathExpander helps pre-process command-line arguments expanding"
DESCRIPTION = "PathExpander helps pre-process command-line arguments expanding \
directories into their constituent files. It further helps by \
providing additional mechanisms to make specifying subsets easier \
with path subtraction and allowing for command-line arguments to be \
saved in a file. \
NOTE: this is NOT an options processor. It is a path processor \
(basically everything else besides options). It does provide a \
mechanism for pre-filtering cmdline options, but not with the intent \
of actually processing them in PathExpander. Use OptionParser to \
deal with options either before or after passing ARGV through \
PathExpander."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ruby3.2-rubygem-path_expander-1.1.1-1.5.aarch64.rpm"
RPM_HASH = "a5bb4179cb97ce13113bc44756caa0aac67aaf25740f170f86c01b6e4fcdd6ba443a987eb2c25d9386d44d8c3d98af82fe5e2c3de7efa189ef95fca064fcb63a"

RPROVIDES:${PN} += "ruby3.2-rubygem-path_expander ruby3.2-rubygem-path_expander(aarch-64) rubygem(path_expander) rubygem(ruby:3.2.0:path_expander) rubygem(ruby:3.2.0:path_expander:1) rubygem(ruby:3.2.0:path_expander:1.1) rubygem(ruby:3.2.0:path_expander:1.1.1)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
