SUMMARY = "Config file reading, writing and validation"
DESCRIPTION = "ConfigObj is a simple but powerful config file reader and writer: an ini \
file round tripper. Its main feature is that it is very easy to use, with a \
straightforward programmer's interface and a simple syntax for config files. \
It has lots of other features though: \
 \
 * Nested sections (subsections), to any level \
 * List values \
 * Multiple line values \
 * Full Unicode support \
 * String interpolation (substitution) \
 * Integrated with a powerful validation system \
   - including automatic type checking/conversion \
   - and allowing default values \
   - repeated sections \
 * All comments in the file are preserved \
 * The order of keys/sections is preserved \
 * Powerful ``unrepr`` mode for storing/retrieving Python data-types"
LICENSE = "BSD-3-Clause"

PV = "5.0.8"

RPM_NAME = "python311-configobj-5.0.8-1.1.noarch.rpm"
RPM_HASH = "4f815de69002e70c260520f8666c411871e80c97d225b97fd9244bf670277808bb26c33b52f4d6d65dc9d7b077f6a2f7f3112daf1b580560f0ba932fea9b50ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(configobj) python311-configobj python3dist(configobj)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
