SUMMARY = "Python Publish-Subscribe Package"
DESCRIPTION = "PyPubSub provides a publish - subscribe API that facilitates the development of \
event-based / message-based applications. PyPubSub supports sending and \
receiving messages between objects of an application. It is centered on the \
notion of a topic; senders publish messages of a given topic, and listeners \
subscribe to messages of a given topic. The package also supports a variety of \
advanced features that facilitate debugging and maintaining pypubsub topics and \
messages in larger applications."
LICENSE = "BSD-2-Clause"

PV = "4.0.3"

RPM_NAME = "python39-pypubsub-4.0.3-1.8.noarch.rpm"
RPM_HASH = "6083c41e3be052b42b2b3e1064d99885549a842df81614e4fafc191c035a045cc6bec7df16a9caf24767288458845f90e8ff21eba2221c99e50c4ecb0a267698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pypubsub) python39-pypubsub python3dist(pypubsub)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
