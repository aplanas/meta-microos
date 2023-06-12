SUMMARY = "Textwrap, but savvy to ANSI colors and styles"
DESCRIPTION = "Ansiwrap wraps text, like the standard textwrap module. \
But it also correctly wraps text that contains ANSI control \
sequences that colorize or style text. \
 \
Where textwrap is fooled by the raw string length of those control codes, \
ansiwrap is not; it understands that however much those codes affect color \
and display style, they have no logical length."
LICENSE = "Apache-2.0"

PV = "0.8.4"

RPM_NAME = "python310-ansiwrap-0.8.4-2.2.noarch.rpm"
RPM_HASH = "3e72c755dedbe19ffe773d2dfa0c96f10cff62ee43f4f70979e09ec23f810108c61da30bc10222cf30bec5a962433449a45617fc13fee26f60f2784001bd0df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansiwrap \
python3.10dist(ansiwrap) \
python310-ansiwrap \
python3dist(ansiwrap)"
RDEPENDS:${PN} += "python(abi) \
python310-textwrap3"

inherit rpm
