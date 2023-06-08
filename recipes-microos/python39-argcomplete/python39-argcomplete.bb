SUMMARY = "Bash tab completion for argparse"
DESCRIPTION = "Argcomplete provides easy, extensible command line tab completion of \
arguments for your Python script. \
 \
It makes two assumptions: \
 \
* You're using bash as your shell \
* You're using argparse to manage your command line arguments/options \
 \
Argcomplete is particularly useful if your program has lots of options \
or subparsers, and if your program can dynamically suggest completions \
for your argument/option values (for example, if the user is browsing \
resources over the network)."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "python39-argcomplete-3.0.8-1.1.noarch.rpm"
RPM_HASH = "b0f5c6b0cb59d5d0dd7a8b26572722676e64bebf4643ca7e3658e1af5871dddc0044876652fe608e10ecc6bdba60b103d9da3e8d5a83cd747ced6406bebbd833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(argcomplete) python39-argcomplete python3dist(argcomplete)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
