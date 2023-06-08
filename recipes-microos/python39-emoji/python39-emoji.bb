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

RPM_NAME = "python39-emoji-2.2.0-1.3.noarch.rpm"
RPM_HASH = "fff97ee4be49e6e9eea64be132f05aba924a7ac51c7f8f96f1d76cb72d292a65e056fb14afdd4bff1a97ed71f0794362ea7d8f51caf250e67a772bb4d073880f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(emoji) python39-emoji python3dist(emoji)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
