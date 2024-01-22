package fake

import fake.example.marsphotos.data.MarsPhotosRepository
import fake.example.marsphotos.network.MarsPhoto

class FakeNetworkMarsPhotosRepository: MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
