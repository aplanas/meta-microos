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

RPM_NAME = "python311-argcomplete-3.0.8-1.1.noarch.rpm"
RPM_HASH = "ed2b9472886836f8d68d190fb2a465c6f57f18f68ad9ffb59c5d06ba65a4ba59f0a0b32cb3ad48d687f43b435aad81218e18cfb61846c1f597f6e5b5999ce585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(argcomplete) python311-argcomplete python3dist(argcomplete)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
