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

RPM_NAME = "python310-emoji-2.2.0-1.3.noarch.rpm"
RPM_HASH = "a870f9858680699aefabeee3028a1e1d27c80a45fbcfb8e1985c67f3e0f63f6eb8c76015e2c6da84db9825e8976d605479801b61b348c71a67982b1440d46eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emoji python3.10dist(emoji) python310-emoji python3dist(emoji)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
