SUMMARY = "Microsoft Azure WebPubSub Service Client Library for Python"
DESCRIPTION = "Azure Web PubSub Service is a service that enables you to build real-time messaging web applications \
using WebSockets and the publish-subscribe pattern. Any platform supporting WebSocket APIs can connect \
to the service easily, e.g. web pages, mobile applications, edge devices, etc. The service manages the \
WebSocket connections for you and allows up to 100K concurrent connections. It provides powerful APIs \
for you to manage these clients and deliver real-time messages. \
 \
Any scenario that requires real-time publish-subscribe messaging between server and clients or among \
clients, can use Azure Web PubSub service. Traditional real-time features that often require polling \
from server or submitting HTTP requests, can also use Azure Web PubSub service. \
 \
We list some examples that are good to use Azure Web PubSub service: \
 \
 * High frequency data updates: gaming, voting, polling, auction. \
 * Live dashboards and monitoring: company dashboard, financial market data, instant sales update, \
   multi-player game leader board, and IoT monitoring. \
 * Cross-platform live chat: live chat room, chat bot, on-line customer support, real-time shopping \
   assistant, messenger, in-game chat, and so on. \
 * Real-time location on map: logistic tracking, delivery status tracking, transportation status \
   updates, GPS apps. \
 * Real-time targeted ads: personalized real-time push ads and offers, interactive ads. \
 * Collaborative apps: coauthoring, whiteboard apps and team meeting software. \
 * Push instant notifications: social network, email, game, travel alert. \
 * Real-time broadcasting: live audio/video broadcasting, live captioning, translating, \
   events/news broadcasting. \
 * IoT and connected devices: real-time IoT metrics, remote control, real-time status, \
   and location tracking. \
 * Automation: real-time trigger from upstream events. \
 \
Use the client library to: \
 \
 * Send messages to hubs and groups. \
 * Send messages to particular users and connections. \
 * Organize users and connections into groups. \
 * Close connections \
 * Grant/revoke/check permissions for an existing connection"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-azure-messaging-webpubsubservice-1.0.1-1.7.noarch.rpm"
RPM_HASH = "67b4f47e4bd78dbbb24346d9dde99ef69f15b197fc532f673c7e264b4c327155cdbaf7bba33263a2f93a0fc80bc4e60bfc8b07b7411afd7c34ab4873b0d1fa3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-messaging-webpubsubservice) \
python311-azure-messaging-webpubsubservice \
python3dist(azure-messaging-webpubsubservice)"
RDEPENDS:${PN} += "python(abi) \
python311-PyJWT \
python311-azure-core \
python311-azure-messaging-nspkg \
python311-azure-nspkg \
python311-cryptography \
python311-msrest \
python311-six"

inherit rpm
