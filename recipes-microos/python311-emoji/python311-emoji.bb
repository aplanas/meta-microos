SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``) but Spanish (``'es'``), Portuguese (``'pt'``) and Italian (``'it'``) are also supported."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-emoji-2.2.0-1.3.noarch.rpm"
RPM_HASH = "687acc07d3b7c7e2e16dc654fb4c676e17111e50a1c3d721e3beb3b3e7cf666335deef870df7fd7b7feff8663265302fc2960c1d3e152347ac99f6a8a646545a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(emoji) python311-emoji python3dist(emoji)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
